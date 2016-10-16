package com.ups.Repository;

import com.ups.Model.Mechanic;
import org.springframework.data.couchbase.core.query.View;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import java.util.List;

/**
 * Created by dbg1lnb on 10/16/2016.
 */
public interface MechanicRepository extends CouchbaseRepository<Mechanic, String> {

    @View(designDocument = "mechanic_view", viewName = "mechanic_view")
    List<Mechanic> findAllMechanics();


}
