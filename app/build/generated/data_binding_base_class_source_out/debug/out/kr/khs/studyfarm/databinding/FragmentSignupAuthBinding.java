// Generated by data binding compiler. Do not edit!
package kr.khs.studyfarm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import kr.khs.studyfarm.R;
import kr.khs.studyfarm.login_process.sign_up_auth.SignupAuthViewModel;

public abstract class FragmentSignupAuthBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final Button signemailBtnNext2;

  @NonNull
  public final TextView signupauthEmail;

  @NonNull
  public final TextView signupauthInquire;

  @NonNull
  public final TextView signupauthMaintitle;

  @NonNull
  public final TextView signupauthSubtitle;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @Bindable
  protected SignupAuthViewModel mViewModel;

  protected FragmentSignupAuthBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintLayout, Button signemailBtnNext2, TextView signupauthEmail,
      TextView signupauthInquire, TextView signupauthMaintitle, TextView signupauthSubtitle,
      TextView textView6, TextView textView7) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintLayout = constraintLayout;
    this.signemailBtnNext2 = signemailBtnNext2;
    this.signupauthEmail = signupauthEmail;
    this.signupauthInquire = signupauthInquire;
    this.signupauthMaintitle = signupauthMaintitle;
    this.signupauthSubtitle = signupauthSubtitle;
    this.textView6 = textView6;
    this.textView7 = textView7;
  }

  public abstract void setViewModel(@Nullable SignupAuthViewModel viewModel);

  @Nullable
  public SignupAuthViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentSignupAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_signup_auth, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSignupAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSignupAuthBinding>inflateInternal(inflater, R.layout.fragment_signup_auth, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSignupAuthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_signup_auth, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSignupAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSignupAuthBinding>inflateInternal(inflater, R.layout.fragment_signup_auth, null, false, component);
  }

  public static FragmentSignupAuthBinding bind(@NonNull View view) {
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
  public static FragmentSignupAuthBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSignupAuthBinding)bind(component, view, R.layout.fragment_signup_auth);
  }
}
