package com.example.facebookcloneandroid.navigation

import androidx.annotation.StringRes
import com.example.facebookcloneandroid.R

enum class Routes(
    val route: String,
    @StringRes val title: Int = R.string.find_your_account,
) {
    Splash(route = "splash_screen"),
    DashBoard(route = "dashboard_screen"),
    Login(route = "login_screen"),
    ForgotPassword(route = "forgot_password", title = R.string.find_your_account),
    OtpVerify(route = "otp_verify",title = R.string.find_your_account),
    CreateNewPassword(route = "create_new_password", title = R.string.reset_your_password),
    SignUp(route = "sign_up", title = R.string.create_account),
    JoinFacebook(route = "join_facebook", title = R.string.create_account),
    WhatYourName(route = "what_your_name", title = R.string.create_account),
    WhatYourBirthday(route = "what_your_birthday", title = R.string.birthday),
    WhatYourGender(route = "what_your_gender", title = R.string.gender),
    ContactNumber(route = "contact_number", title = R.string.mobile_number),
    ChoosePassword(route = "choose_password", title = R.string.password_hint),
    TermsAndPrivacy(route = "terms_and_privacy", title = R.string.terms_and_privacy),
}