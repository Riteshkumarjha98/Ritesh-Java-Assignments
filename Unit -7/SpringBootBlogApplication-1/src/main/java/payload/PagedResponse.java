package payload;


import lombok.Data;


import java.util.List;

@Data
public class PagedResponse<T> {
	private List<T> content;
	private int page;
	private int size;
	private long totalElements;
	private int totalPages;
	private boolean last;

	public PagedResponse() {

	}


}
