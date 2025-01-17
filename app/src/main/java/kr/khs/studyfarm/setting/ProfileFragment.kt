package kr.khs.studyfarm.setting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kr.khs.studyfarm.R
import kr.khs.studyfarm.databinding.FragmentProfileBinding
import kr.khs.studyfarm.dialog
import kr.khs.studyfarm.network.ApiStatus

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentProfileBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_profile, container, false
        )

        binding.lifecycleOwner = viewLifecycleOwner

        val viewModelFactory = ProfileViewModelFactory()

        val viewModel = ViewModelProvider(this, viewModelFactory).get(ProfileViewModel::class.java)

        binding.viewModel = viewModel

        viewModel.apiStatus.observe(viewLifecycleOwner, Observer {
            if(it == ApiStatus.LOADING) {
                dialog.onLoadingDialog(requireActivity())
            }
            else if(dialog.loadingDialog != null && dialog.loadingDialog!!.isShowing) {
                dialog.offLoadingDialog()
            }
        })

        return binding.root
    }

}