package kr.khs.studyfarm

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.AdapterView
import android.widget.DatePicker
import android.widget.Spinner
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.BindingAdapter
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.google.android.material.textfield.TextInputLayout


@BindingAdapter("app:validation", "app:errorMsg")
fun setErrorEnable(textInputLayout: TextInputLayout, stringRule: StringRule, errorMsg: String) {
    textInputLayout.editText?.addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

        override fun afterTextChanged(p0: Editable?) {
            textInputLayout.error =
                if (stringRule.validate(p0))
                    null
                else
                    errorMsg
        }

    })
}

@BindingAdapter("app:setPasswordVisibilityToggle")
fun setPasswordVisibility(textInputLayout: TextInputLayout, enabled: Boolean) {
    textInputLayout.isPasswordVisibilityToggleEnabled = enabled
}

object Rule {
    val EMAIL_RULE: StringRule = object : StringRule {
        override fun validate(s: Editable?): Boolean {
            return isEmailValidate(s.toString())
        }
    }

    val PASSWORD_RULE : StringRule = object : StringRule {
        override fun validate(s: Editable?) : Boolean {
            return isPasswordValidate(s.toString())
        }
    }
}

interface StringRule {
    fun validate(s: Editable?): Boolean
}

@BindingAdapter("android:year", "android:month", "android:day")
fun setDate(view: DatePicker, year: Int, month: Int, day: Int) {
    view.updateDate(year, month, day)
}

//TODO - Spinner하고 ChipGroup 연결하기(현재 연결이 잘 안됨)
@BindingAdapter("connectChipGroup")
fun addChip(view : Spinner, chipGroupId : Int) {
    val chipGroup = view.rootView.findViewById<ChipGroup>(chipGroupId)
    val context = chipGroup.rootView.context
    view.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
        override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
            if(p2 == 0)
                return
            if(chipGroup.childCount >= 3) {
                Toast.makeText(context, "관심 스터디는 최대 3개까지 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                return
            }
            val chip = Chip(context)
            chip.apply {
                this.text = p0?.getItemAtPosition(p2).toString()
                isCheckable = false
                isCloseIconVisible = true
                closeIcon = ResourcesCompat.getDrawable(resources, android.R.drawable.ic_menu_close_clear_cancel, null)
                setOnCloseIconClickListener {
                    chipGroup.removeView(it)
                }
            }
            chipGroup.addView(chip)
        }

        override fun onNothingSelected(p0: AdapterView<*>?) {
        }

    }

}