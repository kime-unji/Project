package global.sesoc.web6.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;

import global.sesoc.web6.vo.Board;
import global.sesoc.web6.vo.Reply;

/**
 * 게시판 관련 Mybatis 사용 메서드
 */
public interface BoardMapper {
	//글 저장
	public int insertBoard(Board board);
	//글번호로 해당 게시글 검색
	public Board getBoard(int boardnum);
	//조회수 1 증가
	public int addHits(int boardnum);
	//검색 후의 총 글 개수
	public int getTotal(String searchText);
	//검색 후의 현재 페이지 목록
	public ArrayList<Board> listBoard(String searchText, RowBounds rb);
	//글번호와 아이디로 해당 게시글 삭제
	public int deleteBoard(Board board);
	//글 수정
	public int updateBoard(Board board);

	//리플 저장
	public int insertReply(Reply reply);
	//한 게시물의 리플 목록
	public ArrayList<Reply> listReply(int boardnum);
	//리플번호와 아이디로 해당 리플 삭제
	public int deleteReply(Reply reply);
	//리플 수정
	public int updateReply(Reply reply);
}
