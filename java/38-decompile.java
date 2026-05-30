/*
38. Decompile a Class File
• Objective: Reverse engineer compiled Java bytecode.
• Task: Use a tool like JD-GUI or CFR to decompile a .class file.
• Instructions:
o Write a simple Java program and compile it.
o Open the .class file in a decompiler.
o Analyze the decompiled source.
*/

// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class MyThread extends Thread {
   private String message;
   private int count;

   MyThread(String var1, int var2) {
      this.message = var1;
      this.count = var2;
   }

   MyThread(String var1) {
      this.message = var1;
      this.count = 5;
   }

   public void run() {
      for(int var1 = 0; var1 < this.count; ++var1) {
         System.out.println(this.message + " - " + var1);
      }

   }
}
