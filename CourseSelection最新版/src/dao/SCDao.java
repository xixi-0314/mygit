package dao;
import entity.IEntity;
import entity.SC;
import java.util.HashMap;

public class SCDao implements IDao {
	private static SCDao instance;
	private HashMap<String,IEntity> scs=new HashMap<String,IEntity>();
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
	@Override
	public void insert(IEntity entity) {
		SC sc = (SC)entity;
		scs.put(sc.getStudentNo(), sc);
	}
	public void delete1(IEntity ientity) {
		scs.put(((SC)ientity).getStudentNo(),(SC)ientity);
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
}
