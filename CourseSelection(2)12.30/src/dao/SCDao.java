package dao;
import entity.IEntity;
import entity.SC;
import entity.Student;

import java.util.HashMap;

public class SCDao implements IDao {
	private static SCDao instance;
	private HashMap<String,IEntity> scs;
	private SC sc;
	@Override
	public void insert(IEntity entity) {
		SC sc = (SC)entity;
		scs.put(sc.getStudentNo(), sc);

	}

	@Override
	public void delete() {

	}

	@Override
	public void update() {

	}

	@Override
	public HashMap<String, IEntity> getAllEntities() {
		return scs;
	}

	@Override
	public IEntity getEntity(String Id) {
		return scs.get(Id);
	}

	public static SCDao getInstance() {
		if(instance == null) {
			synchronized(StudentDao.class) {
				if(instance == null) {
					instance = new SCDao();
					return instance;
				}
			}
		}
		return instance;
	}

}
