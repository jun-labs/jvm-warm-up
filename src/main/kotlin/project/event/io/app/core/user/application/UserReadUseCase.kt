package project.event.io.app.core.user.application

import project.event.io.app.core.user.domain.User

interface UserReadUseCase {
    fun findById(userId: Long): User?
}
