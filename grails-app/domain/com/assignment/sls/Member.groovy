package com.assignment.sls

class Member {

    Integer id
    String firstName
    String lastName
    String address
    String email
    String phone
    String birth
    String password
    String memberType = GlobalConfig.USER_TYPE.REGULAR_MEMBER
    String identityHash
    Long identityHashLastUpdate
    Boolean isActive = true

    Date dateCreated
    Date lastUpdated

//    static hasMany = [contact: Contact, contactGroup: ContactGroup]

    static constraints = {
        email(email: true, nullable: false, unique: true, blank: false)
        password(blank: false)
        lastName(nullable: true)
        identityHash(nullable: true)
        identityHashLastUpdate(nullable: true)
    }

    def beforeInsert (){
        this.password = this.password.encodeAsMD5()
    }


    def beforeUpdate(){
        this.password = this.password.encodeAsMD5()
    }
}
