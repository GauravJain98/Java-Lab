package com.company;
// WAP to create stack and extends the functionality using super and this keyword
public class Main {

    public static void main(String[] args) {
	// write your code here
        extend_stack st = new extend_stack(5);
        st.push(43);
        st.push(67);
        st.push(23);
        st.push(12);
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
    }
}
