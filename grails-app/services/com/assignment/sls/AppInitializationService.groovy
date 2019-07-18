package com.assignment.sls


class AppInitializationService {


    static initialize() {
        initMember()
    }

    private static initMember() {
        if (Member.count() == null) {
            Member member = new Member()
            member.firstName = "System"
            member.lastName = "Administrator"
            member.email = "admin@localhost.local"
            member.password = "admin"
            member.memberType = GlobalConfig.USER_TYPE.ADMINISTRATOR
            member.save(flush: true)

        }

    }
}
