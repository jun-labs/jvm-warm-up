package project.event.io.app.core.user.application

import project.event.io.app.core.user.domain.User

interface UserWriteUseCase {
    fun sve(user: User): Long

    fun saveAll(users: List<User>)
}
