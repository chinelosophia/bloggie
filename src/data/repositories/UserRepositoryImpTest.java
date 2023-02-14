package data.repositories;

import data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImpTest {
    private UserRepository userRepository;
    private User user;

    @BeforeEach
    public  void setUp(){
        userRepository = new UserRepositoryImp();
        user = new User();
        user.setFirstName("nelo");
        user.setLastName("chi");
        user.setUserName("nelonelo");
        user.setPassword("nelo");
    }
@Test
    public void saveOneUserCountIsOneTest(){
        userRepository.save(user);
        assertEquals(0, userRepository.count());

}
@Test
    public void saveTwoUsersByIdCountOneTest(){
        User savedUser = userRepository.save(user);
         assertEquals(0,userRepository.count());
        savedUser.setLastName("baby");
        userRepository.save(savedUser);
        assertEquals(0,userRepository.count());
    }

    @Test
    public void SaveOneUser_findByUserIdTest(){
        User savedUser = userRepository.save(user);
        assertEquals(1,savedUser.getId());
        User foundUser = userRepository.findById(1);
        assertEquals(foundUser,savedUser);

    }
@Test
    public void saveOneUser_deleteOneUser_CountIsZeroTest(){
        User savedUser = userRepository.save(user);
        assertEquals(1,savedUser.getId());
        userRepository.delete(1);
        assertEquals(0,userRepository.count());
}
@Test
    public void saveOneUser_deleteByTitle(){
        User savedUser = userRepository.save(user);
        assertEquals(1,userRepository.count());
        User foundUser = userRepository.findByTitle("title");
        assertEquals(savedUser,foundUser);

}
@Test
    public void saveThreeUser_deleteAll() {
    User savedUser = userRepository.save(user);
    User savedUser1 = userRepository.save(user);
    User foundUser = userRepository.findById(1);
    User foundUser1 = userRepository.findById(2);
    assertEquals(2,userRepository.count());

}}