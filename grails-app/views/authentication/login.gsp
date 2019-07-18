<meta name="layout" content="public"/>

<div id="global-wrapper">
    <div id="content-wrapper">
        <div class="container">
            <div class="row">
                <div class="col-sm-6 col-md-4 mx-auto">
                    <h1 class="text-center login-title">Member Login</h1>
                    <div class="account-wall">
                        <g:img dir="images" file="login.png" class="profile-img"/>
                        <g:form controller="authentication" action="doLogin" class="form-signin">
                            <g:textField name="email" class="form-control" placeholder="Email" required="required" />
                            <g:passwordField name="password" class="form-control" placeholder="Password" required="required" />
                            <g:submitButton class="btn btn-lg btn-primary btn-block" name="login" value="Login"/>
                            <div class="xtra"><label style="padding-top: 10px; padding-right: 5px ">Are you new here? </label><g:link controller="authentication" action="registration" style="text-decoration: underline">Register Now</g:link></div
                        </g:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>