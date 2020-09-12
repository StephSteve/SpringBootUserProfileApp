package com.peerLending.userprofile.domain.model.repository;

import com.peerLending.userprofile.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
