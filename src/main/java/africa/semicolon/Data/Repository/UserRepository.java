package africa.semicolon.Data.Repository;

import africa.semicolon.Data.Model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ContactRepository extends MongoRepository<Contact,Long> {
    @Autowired
    private userRepository  userRepository
}
