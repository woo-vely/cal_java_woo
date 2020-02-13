package postfixEx;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author developer
 * infix to postfix
 */
public class infix2postfix {
	public String input = null;		// �Է� ���ڿ�
	public stack stack = null;		// ����
	public String output = null;	// ��� ���ڿ� (postfix)
	
	/**
	 * @param input
	 */
	public infix2postfix(String input) {
		this.input = input;
		this.stack = new stack();
		this.output = "";
	}
	
	/**
	 * 
	 */
	public infix2postfix() {
		System.out.print("infix ������ �Է��Ͻÿ� : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			this.input = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ;
		}
		
		this.stack = new stack();
		this.output = "";
	}
	
	/**
	 * in2post()
	 */
	public void in2post() {
		for (int i = 0; i < this.input.length(); i++) {
			// �ѱ��ھ� �ݺ��ϱ�
			
			char c = input.charAt(i);	// �ѱ��ھ� ��������
			if (c >= '0' && c<= '9') {
				// �ǿ������� ���
				this.output += c;
			}
			else if (c == '+' || c == '-') {
				while (!this.stack.IsEmpty()) {
					// ���� ������ ������� �ʴٸ�
					
					char prev_c = this.stack.pop();	// ���� �ֻ���� �����ڸ� ������
					if (prev_c == '*' || prev_c == '/' || prev_c == '+' || prev_c == '-') {
						// ���� �ֻ�� �����ڰ� ���� ������ ���� ���� �����ڶ��
						
						output += prev_c;                             
					}
					else {
						this.stack.push(prev_c);
						break;
					}
				}
				this.stack.push(c);
			}
			else if (c == '*' || c == '/') {
				while (!this.stack.IsEmpty()) {
					// ���� ������ ������� �ʴٸ�
					
					char prev_c = this.stack.pop();  // ���� �ֻ���� �����ڸ� ������
					if (prev_c == '*' || prev_c == '/')
                    {
                        // ���� �ֻ�� �����ڰ� ���� ������ ���� ���� �����ڶ��
                        output += prev_c;
                    }
                    else
                    {
                    	this.stack.push(prev_c);
                        break;                            
                    }
				}
				this.stack.push(c);
			}
			else if (c == '(') {
                this.stack.push(c);
            }
            else if (c == ')') {
                while (true)
                {
                    char prev_oper = this.stack.pop();	// ���� ������ �ֻ��� �����ڸ� �����´�. 
                    if (prev_oper == '(')
                        break;
                    output += prev_oper;	// ���� ������ �ֻ��� �����ڸ� ������� ������. 
                }
            }
		}
		
		// stack�� �ִ� ��� �����ڸ� ���������� ������ output�� �ִ´�. 
        while (!this.stack.IsEmpty())
        {
            output += this.stack.pop();
        }
        
        // ��� ���
        System.out.println(this.output);
	}
}









