## 基本数据类型
java有8种基本数据类型，4种整型，2种浮点型，一种用于表示Unicode编码的字符单元的字符型类型char，一种布尔类型。

|  类型   | 大小【字节】 | 范围                                                         |
| :-----: | :----------: | ------------------------------------------------------------ |
|  byte   |    1 byte    | 2<sup>-7</sup> ~2<sup>7</sup>-1【-128~127】                  |
|  short  |    2 byte    | 2<sup>-15</sup> ~2<sup>15</sup>-1【-32768~32767】            |
|   int   |    4 byte    | 2<sup>-31</sup> ~2<sup>31</sup>-1【-21亿~21亿】【2 147 183 647】 |
|  long   |    8 byte    | 2<sup>-63</sup> ~2<sup>63</sup>-1【922 337 203亿】           |
|  float  |    4 byte    | 一般不使用                                                   |
| double  |    8 byte    | 双精度型                                                     |
|  char   |    2 byte    | 和Unicode区分                                                |
| boolean |    不确定    | 1bit可以表示，true \| false 【1byte = 8bit】                 |

## 类之间关系
```
依赖：use-a，一个类的方法，操纵另外一个类的对象，如Order类使用Account查看对象信用状态。
聚合：has-a，类A的对象，包含类B的对象
继承：is-a，RushOrder继承Order类
```

