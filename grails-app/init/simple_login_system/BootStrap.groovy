package simple_login_system

import com.assignment.sls.AppInitializationService

class BootStrap {

    def init = { servletContext ->
        AppInitializationService.initialize()

    }
    def destroy = {
    }
}
