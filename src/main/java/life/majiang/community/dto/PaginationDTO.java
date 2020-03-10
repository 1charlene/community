package life.majiang.community.dto;

import lombok.Data;

import java.util.List;
@Data
public class PaginationDTO<T> {
    private List<T> questions;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages;

    public void setPagination(Integer totalCount, Integer page, Integer size) {
    }
}
