package project.event.io.app.core.user.application.service

import org.springframework.stereotype.Service
import project.event.io.app.core.user.application.UserReadUseCase
import project.event.io.app.core.user.domain.User
import project.event.io.app.core.user.exception.UserNotFoundException
import project.event.io.app.core.user.persistence.UserJpaRepository

@Service
class UserReadService(
    private val userJpaRepository: UserJpaRepository,
) : UserReadUseCase {

    override fun findById(userId: Long): User? {
        return userJpaRepository.findById(userId)
            .orElseThrow { UserNotFoundException() }
    }
}
