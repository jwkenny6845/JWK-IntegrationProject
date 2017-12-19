/**
 * JONATHAN KENNY COP 2006 - FALL 2017 PROF. VANSELOW
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueueDemo {

  Stack<Character> stack = new Stack<>();
  Queue<Character> queue = new LinkedList<>();

  void pushCharacter(Character ch) {
    stack.push(ch);
  }

  void enqueueCharacter(char ch) {
    queue.add(ch);
  }

  char popCharacter() {
    return stack.pop();
  }

  char dequeueCharacter() {
    return queue.remove();
  }

}
