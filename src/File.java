import java.time.LocalDate;
import java.util.ArrayList;

public class File {

    private final int id;
    private final LocalDate dateOpened;
    private MemberCategory memberCategory;
    private Member memberDetails;
    private final ArrayList<Page> pages;

    public File() {
        id = IdGenerator.generate();
        dateOpened = LocalDate.now();
        pages = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public LocalDate getDateOpened() {
        return dateOpened;
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public void removePage(int pageNumber) {
        Page pageToRemove = new Page();
        for(Page page : pages) {
            if(page.getNumber() == pageNumber) {
                pageToRemove = page;
            }
        }
        pages.remove(pageToRemove);
    }

    public void addPage(Page page) {
        pages.add(page);
    }

    public int getNumberOfPages() {
        return pages.size();
    }

    public boolean hasPage(Page page) {
        return pages.contains(page);
    }

    public MemberCategory getMemberCategory() {
        return memberCategory;
    }

    public Member getMemberDetails() {
        return memberDetails;
    }

    public void setMemberCategory(MemberCategory memberCategory) {
        this.memberCategory = memberCategory;
    }

    public void setMemberDetails(Member memberDetails) {
        this.memberDetails = memberDetails;
    }
}
