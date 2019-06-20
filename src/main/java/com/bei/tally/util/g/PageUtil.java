package com.bei.tally.util.g;
/**
 * 
 * @ClassName: PageUtil 
 * @Description: TODO(分页工具类) 
 * @author 技术部--徐周环   -.- 
 * @date 2018年11月29日 下午2:57:45 
 *
 */
public class PageUtil {

	@SuppressWarnings("unused")
	private int offset;// 偏移量
	private int pageSize = 10;// 每页显示记录数
	private int count; // 记录总数
	private int total;// 记录总页数
	private int currentPage = 1;// 记录当前页

	public int getOffset() {
		return (currentPage - 1) * pageSize;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		if (count != 0 && count % pageSize == 0) {
			this.total = count / pageSize;
		} else {
			this.total = count / pageSize + 1;
		}
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

}
