# 软件工程实验1：表达式的化简与求导
作者：张东昌 高文成
time: 2016.12.12
### 程序功能

1. 实现了+，-，\*，/，^五种运算方式，暂时不支持括号
2. 支持小数计算(幂必须为非负整数）
2. 具体指令如下
```
 表达式               #输入合法表达式
 !simplify            #化简指令
 !simplify x=1 y=2... #表达式赋值化简
 !d/dx                #求导指令
 !help                #获取帮助信息指令
 !q                   #退出指令
```

### 输入限制

1. 表达式尽可能合法，不能出现空格
2. 变量乘法：变量之间可以省略\*
3. 支持x^n，3^n，其中n必须为大于0的整数

### 程序输出

1. 第一次输入运行程序需要输入表达式，否则输出提醒
2. 输入为空时输出提醒
3. 表达式中存在除以0的情况会终止计算并且输出提醒
4. 程序将所有可以合并的项合并到一起，并且按照字典序排序，如2\*x\*2\*y\*x将输出4\*x^2\*y

