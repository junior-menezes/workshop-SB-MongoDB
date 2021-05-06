package online.diagnosticit.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import online.diagnosticit.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
