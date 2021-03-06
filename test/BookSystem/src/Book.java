import java.util.Scanner;

public class Book{
		private String[] BookDatas = new String[5];
		public void initBookDatas(){
			BookDatas[0] = "JavaSE";
			BookDatas[1] = "Java";
			BookDatas[2] = "Network";
			BookDatas[3] = "MySQL";
			BookDatas[4] = "Algorithm";
		}
		
		public void MainInterface(){
			try{
				int flag = 0;
				while(flag == 0){
					System.out.println("输入命令：1.按照名称查找  2.按照序号查找 0.退出程序");
					Scanner sc = new Scanner(System.in);
					int result = sc.nextInt();
					if(result == 1)
						NameSearch();
					else if(result == 2)
						NumSearch();
					else if(result == 0) {
						flag = 1;
					}
					else{
						throw new CommandException();
					}
				}
				System.out.println("欢迎再次使用系统");
			}catch(StringException e){
				System.out.println("命令输入错误，请根据提示输入名称");
				MainInterface();
			}catch(IntException e){
				System.out.println("命令输入错误，请根据提示输入序号");
				MainInterface();
			}catch(CommandException e){
				System.out.println("命令输入错误，请根据提示输入指令序号");
				MainInterface();
			}
			
		}
		
		public void NameSearch() throws StringException{
			System.out.println("请输入图书名称：");
			Scanner in = new Scanner(System.in);
			String name = in.next();
			for(String bookName:BookDatas){
				if(bookName.equals(name)){
					System.out.println("您所找的书为：" + name);
					return;
				}
			}
			throw new StringException("输入书名无效");
		}
		
		public void NumSearch() throws IntException{
			System.out.println("请输入图书序号：");
			Scanner in = new Scanner(System.in);
				int num = in.nextInt();
				if(num>0 && num<5)
					System.out.println("您所找的书为："+ BookDatas[num]);
				else
					throw new IntException("输入序号无效");
		}
		
	}
	
	class StringException extends Exception{
		public StringException(){}
		public StringException(String message){
			super(message);
		}
	}
	
	class IntException extends Exception{
		public IntException(){}
		public IntException(String message){
			super(message);
		}		
	}
	
	class CommandException extends Exception{
		public CommandException(){}
		public CommandException(String message){
			super(message);
		}
	}
	
