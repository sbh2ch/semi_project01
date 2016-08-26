package detail;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;

public class DetailDAO{
	 private static SqlSession session;
	 
	 public DetailDAO(){
		 session = MyAppSqlConfig.getSqlSessionInstance();
	 }

	public List<DetailVO> selectAllDetail() {
		return session.selectList("myDetail.selectAllDetail");
	}

}
