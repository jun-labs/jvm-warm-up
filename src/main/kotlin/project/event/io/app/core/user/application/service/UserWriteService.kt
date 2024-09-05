package project.event.io.app.core.user.application.service

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import project.event.io.app.core.user.application.UserWriteUseCase
import project.event.io.app.core.user.domain.User
import project.event.io.app.core.user.persistence.UserJpaRepository

@Service
class UserWriteService(
    private val userJpaRepository: UserJpaRepository,
) : UserWriteUseCase {

    @Transactional
    override fun sve(user: User): Long {
        return userJpaRepository.save(user).id!!
    }

    @Transactional
    override fun saveAll(users: List<User>) {
        userJpaRepository.saveAll(users)
    }
}
