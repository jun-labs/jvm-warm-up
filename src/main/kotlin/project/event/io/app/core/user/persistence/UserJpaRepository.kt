package project.event.io.app.core.user.persistence

import org.springframework.data.jpa.repository.JpaRepository
import project.event.io.app.core.user.domain.User

interface UserJpaRepository : JpaRepository<User, Long>
