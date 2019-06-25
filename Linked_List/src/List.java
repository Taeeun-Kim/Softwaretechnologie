public class List{
    private ListElement head = null;

    public List(ListElement head) {
        this.head = head;
    }
    
    public List() {
    }

    public void append(String content) {
        if (content.isEmpty()) {
            throw new IllegalArgumentException("The argument 'content' cannot be empty!");
        }
        if (head == null) {
            head = new ListElement(content);
        }
        Boolean isLast_el = false;
        ListElement current = head;

        while (isLast_el == false) {
            if (current.getNext() == null) {
                isLast_el = true;
            }else {
                current = current.getNext();
            }
        }
        current.setNext(new ListElement(content));
    }

    public String remove(String content) {
        if (head == null) {
            return null;
        }
        ListElement current = head;

        while (current.getNext() != null) {
            if (current.getNext().getContent() == content) {
                String output = current.getNext().getContent();
                current.setNext(current.getNext().getNext());
                return output;
            }else {
                current = current.getNext();
            }
        }
        return null;
    }
}