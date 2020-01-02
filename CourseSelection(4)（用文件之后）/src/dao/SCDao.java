package dao;
import entity.IEntity;
import entity.SC;
import entity.Student;

import java.util.HashMap;

public class SCDao implements IDao {
	private static SCDao instance;
	private HashMap<String,IEntity> scs=new HashMap<String,IEntity>();
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
	public void update(IEntity ientity) {
		// TODO Auto-generated method stub
		scs.put(((SC)ientity).getStudentNo(),(SC)ientity);
        System.out.println("��ϲ���ѳɹ���ѡ�ÿγ̣����ſγ̣��������ѡ�����˵���ѡ����Ҫ���еĲ�����");
	}
}
