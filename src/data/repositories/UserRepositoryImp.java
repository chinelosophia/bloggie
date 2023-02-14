package data.repositories;

import data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImp implements UserRepository{
    private int count;
    private List<User>users= new ArrayList<>();


    @Override
    public User save(User user) {
        boolean userHasNotBeenSaved = user.getId() == 0;
        if(userHasNotBeenSaved){
            user.setId(generateUserId());
            users.add(user);
            count++;}
        return user;
    }

    private int generateUserId() {

        return count+1;
    }

    @Override
    public User findById(int id) {
        for (User user : users){
            if (user.getid()==id
            )return user;}

        return null;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<User> findAll(){


        return null;
    }

    @Override
    public void delete(User user) {
    }

    @Override
    public void delete(int id) {
for (User user:users){
    if (user.getId()==id){
        users.remove(user);
        count--;
        break;
    }
}
    }
public void deleteByTitle(String title){
        for (User user: users){
            if(user.getTitle()== title){
                users.remove(user);
                count--;
                break;
            }
        }

}
    @Override
    public void deleteAll() {
    users.clear();
    count=0;

    }

    @Override
    public User findByTitle(String title) {
        for (User user : users)
            if (user.getTitle()== title){return user;}
        return null;
    }
}
