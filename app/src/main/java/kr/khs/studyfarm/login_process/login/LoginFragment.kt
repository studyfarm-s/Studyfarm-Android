package kr.khs.studyfarm.login_process.login

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import kr.khs.studyfarm.R
import kr.khs.studyfarm.createAlertDialog
import kr.khs.studyfarm.databinding.FragmentLoginBinding
import kr.khs.studyfarm.dialog
import kr.khs.studyfarm.network.ApiStatus
import kr.khs.studyfarm.view.MainActivity

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentLoginBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false
        )

        val viewModelFactory = LoginViewModelFactory(requireContext())

        val viewModel = ViewModelProvider(this, viewModelFactory).get(LoginViewModel::class.java)

        binding.lifecycleOwner = this

        binding.viewModel = viewModel

        viewModel.loginSuccess.observe(viewLifecycleOwner, Observer {
            if(it) {
                Toast.makeText(context, "로그인 성공", Toast.LENGTH_SHORT).show()
                val intent = Intent(activity, MainActivity::class.java)
                startActivity(intent)
                activity?.finish()
                viewModel.doneLogin()
            }
        })

        viewModel.toast.observe(viewLifecycleOwner, Observer {
            if(it != "") {
//                Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
                createAlertDialog(requireContext(), it, "알겠어요.")
                viewModel.doneToast()
            }
        })

        viewModel.gotoSignUp.observe(viewLifecycleOwner, Observer {
            if(it) {
                findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToSignupFragment())
                viewModel.doneGoToSignUp()
            }
        })

        viewModel.gotoFindPW.observe(viewLifecycleOwner, Observer {
            if(it) {
                findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToFindPWFragment())
                viewModel.doneGoToFindPW()
            }
        })

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