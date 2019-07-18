package com.assignment.sls

class UIHelperTagLib {

    static namespace = "UIHelper"

    AuthenticationService authenticationService
    MemberService memberService
//    ContactGroupService contactGroupService

    def renderErrorMessage = { attrs, body ->
        def model = attrs.model
        String fieldName = attrs.fieldName
        String errorMessage = attrs.errorMessage? g.message(code: attrs.errorMessage): g.message(code: "invalid.input")
        if (model && model.errors && model.errors.getFieldError(fieldName)){
            out << "<small class='form-text text-danger''><strong>${errorMessage}</strong></small>"
        }
    }

    def memberActionMenu = { attrs, body ->
        out << '<li class="nav-item dropdown show">'
        out << g.link(class:"nav-link dropdown-toggle", "data-toggle":"dropdown"){authenticationService.getMemberName()}
        out << '<div class="dropdown-menu">'
        out << g.link(controller: "authentication", action: "changepassword", class: "dropdown-item"){g.message(code:"change.password")}
        out << g.link(controller: "authentication", action: "logout", class: "dropdown-item"){g.message(code:"logout")}
        out << "</div></li>"
    }

    def appBaseURL = { attrs, body ->
        out << AppUtil.baseURL()
    }

    def leftNavigation = { attrs, body ->
        List navigations = [
                [controller: "member", action: "profile", name: "profile.page"],
                [controller: "dashboard", action: "index", name: "change.password"],
        ]

        if(authenticationService.isAdministratorMember()){
            navigations.clear()
            navigations.add([controller: "member", action: "index", name: "user.list"])

        }

        navigations.each { menu ->
            out << '<li class="list-group-item">'
            out << g.link(controller: menu.controller, action: menu.action) { g.message(code: menu.name, args: ['']) }
            out << '</li>'
        }
    }

}
