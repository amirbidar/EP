package Base;

import lombok.Data;

@Data
public class BasePagination {
    private Integer pageNumber;
    private Integer numberOfPages;
    private String text;
}
