package com.vision.Tipster;


@RepositoryRestResource(collectionResourceRel = "slips", path = "slips")
public interface SlipsRepository extends MongoRepository<Slips, String> {
//    create slips
//    findAll slips
//    categorize paid and free slips
//    find slip by user id.
//    delete slips by user.
}