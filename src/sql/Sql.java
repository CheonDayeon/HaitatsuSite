package sql;

public class Sql {
	public static final String YBBS_INSERT_SQL = "INSERT INTO YBBS_QA VALUES "
			+ "(SEQ_QA_NO.NEXTVAL,?,?,SYSDATE,0,?,SEQ_QA_NO.CURRVAL,0)";
	public static final String YBBS_INSERT_REPLY_SQL = "INSERT INTO YBBS_QA VALUES "
			+ "(SEQ_QA_NO.NEXTVAL,?,?,SYSDATE,0,?,?,1)";
<<<<<<< HEAD
<<<<<<< HEAD
=======
    public static final String YBBS_SELECTALL_SQL = "SELECT QANUMBER,QASUBJECT,QADATE,QAVISITED,USERID,QAGROUP,QALEVEL FROM YBBS_QA ORDER BY QAGROUP DESC,QALEVEL ASC,QADATE DESC";
    public static final String YBBS_SELECTBYNO_SQL = "SELECT QANUMBER,USERID,QASUBJECT,QACOMMENT FROM YBBS_QA WHERE QANUMBER = ?";
    public static final String YBBS_UPDATE_SQL = "UPDATE YBBS_QA SET QASUBJECT = ? , QACOMMENT = ? WHERE QANUMBER = ?";
    public static final String YBBS_DELETE_SQL = "DELETE FROM YBBS_QA WHERE QANUMBER = ?";
    public static final String YBBS_UPDATE_VISITED = "UPDATE YBBS_QA SET QAVISITED = QAVISITED+1 WHERE QANUMBER = ?";
    public static final String YBBS_PAGE_SQL = "SELECT * from (SELECT ROWNUM RN,ybbss.* FROM (SELECT * FROM YBBS_QA ORDER BY QAGROUP DESC,QALEVEL ASC,QADATE DESC) ybbss) WHERE RN BETWEEN ? AND ?";
    public static final String YBBS_SELECT_ALL_COUNT ="SELECT COUNT(*) AS cnt FROM YBBS";
	
	//==========================�ڼ��� Sql=======================================
	public static final String RESTAURANT_SELECT_BY_CATEGORY_SQL = "SELECT NAME FROM RESTAURANT WHERE CNUM = ?";
=======
>>>>>>> 9c906d4a82b71e3adf4cfd158f76943188b2522d

	public static final String YBBS_SELECTALL_SQL = "SELECT QANUMBER,QASUBJECT,QADATE,QAVISITED,USERID,QAGROUP,QALEVEL "
			+ "FROM YBBS_QA"
			+ "ORDER BY QAGROUP DESC,QALEVEL ASC,QADATE DESC";
	public static final String YBBS_SELECTBYNO_SQL = "SELECT QANUMBER,USERID,QASUBJECT,QACOMMENT FROM YBBS_QA WHERE QANUMBER = ?";
	public static final String YBBS_UPDATE_SQL = "UPDATE YBBS_QA SET QASUBJECT = ? , QACOMMENT = ? WHERE QANUMBER = ?";
	public static final String YBBS_DELETE_SQL = "DELETE FROM YBBS_QA WHERE QANUMBER = ?";
	public static final String YBBS_UPDATE_VISITED = "UPDATE YBBS_QA SET QAVISITED = QAVISITED+1 WHERE QANUMBER = ?";
	public static final String YBBS_PAGE_SQL = "SELECT * from (SELECT ROWNUM RN,ybbss.* FROM (SELECT * FROM YBBS_QA ORDER BY QAGROUP DESC,QALEVEL ASC,QADATE DESC) ybbss) WHERE RN BETWEEN ? AND ?";
	public static final String YBBS_SELECT_ALL_COUNT ="SELECT COUNT(*) AS cnt FROM YBBS";
		
	//==========================�ڼ��� Sql��=======================================
=======
    public static final String YBBS_SELECTALL_SQL = "SELECT QANUMBER,QASUBJECT,QADATE,QAVISITED,USERID,QAGROUP,QALEVEL "
            + "FROM YBBS_QA"
            + "ORDER BY QAGROUP DESC,QALEVEL ASC,QADATE DESC";
    public static final String YBBS_SELECTBYNO_SQL = "SELECT QANUMBER,USERID,QASUBJECT,QACOMMENT FROM YBBS_QA WHERE QANUMBER = ?";
    public static final String YBBS_UPDATE_SQL = "UPDATE YBBS_QA SET QASUBJECT = ? , QACOMMENT = ? WHERE QANUMBER = ?";
    public static final String YBBS_DELETE_SQL = "DELETE FROM YBBS_QA WHERE QANUMBER = ?";
    public static final String YBBS_UPDATE_VISITED = "UPDATE YBBS_QA SET QAVISITED = QAVISITED+1 WHERE QANUMBER = ?";
    public static final String YBBS_PAGE_SQL = "SELECT * from (SELECT ROWNUM RN,ybbss.* FROM (SELECT * FROM YBBS_QA ORDER BY QAGROUP DESC,QALEVEL ASC,QADATE DESC) ybbss) WHERE RN BETWEEN ? AND ?";
    public static final String YBBS_SELECT_ALL_COUNT ="SELECT COUNT(*) AS cnt FROM YBBS";
	
	//==========================�ڼ��� Sql=======================================
>>>>>>> parent of 56bfbea... 123
	public static final String RESTAURANT_SELECT_BY_CATEGORY_SQL = "SELECT NAME FROM RESTAURANT WHERE CNUM = ?";

	
	//==========================Ȳȣ�� Sql��=======================================
	
	
	//==========================õ�ٿ� Sql��=======================================

>>>>>>> 7e2192997d1d4ea1628b26d25e15c7693d019638
}
