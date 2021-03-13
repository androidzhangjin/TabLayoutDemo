# TabLayoutDemo
* 使用FlycoTabLayout库实现，点击切换效果图
<img src="https://img-blog.csdnimg.cn/20210312202131120.gif#pic_center" width="300"/>

*  Activity调用代码
 ```
 public class MainActivity extends AppCompatActivity {
    SlidingTabLayout tabLayout;
    String[] nameList = new String[]{"课堂报告","学习记录"};
    CannotScrollViewPager viewPager;
    private Fragment[] fragments;
    private ReportFragmentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.vp);

        fragments = new Fragment[2];
        fragments[0] = new RedFragment();
        fragments[1] = new BlueFragment();

        adapter = new ReportFragmentAdapter(getSupportFragmentManager(), fragments, nameList);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(2);

        tabLayout.setViewPager(viewPager, nameList);

    }
}
 ```
*  使用说明，见博客：https://blog.csdn.net/zhangjin1120/article/details/114704380
