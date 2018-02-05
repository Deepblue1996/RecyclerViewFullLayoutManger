# RecyclerViewFullLayoutManger
### 固定高度布局管理器

<pre>RecyclerLayoutManger 扩展布局管理器，适用于需求固定高度使用，

提供三种固定高度布局管理器：FullyLinearLayoutManager，FullyGridLayoutManager，ExStaggeredGridLayoutManager</pre>

![Image text](https://raw.githubusercontent.com/Deepblue1996/RecyclerViewFullLayoutManger/master/20180205102241.jpg)

# How to

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

gradle
maven
sbt
leiningen
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}Copy
Step 2. Add the dependency

	dependencies {
	        compile 'com.github.Deepblue1996:ShowEditText:1.0.0'
	}
