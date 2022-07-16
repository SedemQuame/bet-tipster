package com.vision.Tipster;


@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UsersRepository extends MongoRepository<Users, String> {
//    find the user by their name/email.
//    find the slips related to a user.
//    return all user information for profile.
}