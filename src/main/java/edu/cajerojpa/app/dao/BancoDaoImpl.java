package edu.cajerojpa.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.cajerojpa.app.model.BancoEntity;
 
@Repository
@Transactional
public class BancoDaoImpl implements BancoDao {

	@PersistenceContext
    private EntityManager manager;
	
	@Override
	public boolean addBanco(BancoEntity entity) {
		try{
            manager.persist(entity);
        }catch(Exception e){
        	System.out.println("error addBanco " + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
	}

}
