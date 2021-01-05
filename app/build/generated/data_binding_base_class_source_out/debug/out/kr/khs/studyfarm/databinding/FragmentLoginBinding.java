// Generated by data binding compiler. Do not edit!
package kr.khs.studyfarm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;
import kr.khs.studyfarm.R;
import kr.khs.studyfarm.login_process.login.LoginViewModel;

public abstract class FragmentLoginBinding extends ViewDataBinding {
  @NonNull
  public final Button google;

  @NonNull
  public final Button kakao;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView loginBtnFindpw;

  @NonNull
  public final TextView loginBtnSignup;

  @NonNull
  public final Button naver;

  @NonNull
  public final Button signemailBtnNext;

  @NonNull
  public final TextInputLayout signemailEtEmail;

  @NonNull
  public final TextView signemailMaintitle;

  @NonNull
  public final TextView signemailSubtitle;

  @NonNull
  public final TextView signemailTvSocial;

  @NonNull
  public final TextInputLayout signpwPassword;

  @Bindable
  protected LoginViewModel mViewModel;

  protected FragmentLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button google, Button kakao, LinearLayout linearLayout, TextView loginBtnFindpw,
      TextView loginBtnSignup, Button naver, Button signemailBtnNext,
      TextInputLayout signemailEtEmail, TextView signemailMaintitle, TextView signemailSubtitle,
      TextView signemailTvSocial, TextInputLayout signpwPassword) {
    super(_bindingComponent, _root, _localFieldCount);
    this.google = google;
    this.kakao = kakao;
    this.linearLayout = linearLayout;
    this.loginBtnFindpw = loginBtnFindpw;
    this.loginBtnSignup = loginBtnSignup;
    this.naver = naver;
    this.signemailBtnNext = signemailBtnNext;
    this.signemailEtEmail = signemailEtEmail;
    this.signemailMaintitle = signemailMaintitle;
    this.signemailSubtitle = signemailSubtitle;
    this.signemailTvSocial = signemailTvSocial;
    this.signpwPassword = signpwPassword;
  }

  public abstract void setViewModel(@Nullable LoginViewModel viewModel);

  @Nullable
  public LoginViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, null, false, component);
  }

  public static FragmentLoginBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLoginBinding)bind(component, view, R.layout.fragment_login);
  }
}
