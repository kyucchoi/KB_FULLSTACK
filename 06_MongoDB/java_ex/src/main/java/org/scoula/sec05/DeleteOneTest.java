package org.scoula.sec05;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.scoula.app.Database;
import org.bson.Document;

import static com.mongodb.client.model.Filters.eq;

public class DeleteOneTest {
    public static void main(String[] args) {
        MongoCollection<Document> collection = Database.getCollection("users");

        String id = "666a6b65a25a4c74fddfedc2";
        Bson query = eq("_id", new ObjectId(id));

        DeleteResult result = collection.deleteOne(query);
        System.out.println("==> DeleteResult : " + result.getDeletedCount());

        Database.close();
    }
}
