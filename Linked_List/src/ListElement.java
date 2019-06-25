public class ListElement {
    private String content = "";
    private ListElement next = null;

    public ListElement(String content) {
        if (content.isEmpty()) {
            throw new IllegalArgumentException("The argument 'content' cannot be empty!");
        }
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if (content.isEmpty()) {
            throw new IllegalArgumentException("The argument 'content' cannot be empty!");
        }
        this.content = content;
    }

    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }
}