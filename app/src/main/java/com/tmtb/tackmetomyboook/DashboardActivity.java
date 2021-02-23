package com.tmtb.tackmetomyboook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

public class DashboardActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dashboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_dashboard) {
            ImageView d=(ImageView) findViewById(R.id.imageView) ;
            d.setVisibility(View.GONE);
            WebView webView = (WebView) findViewById(R.id.webviewdata);
            webView.setVisibility(View.VISIBLE);
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setVerticalScrollBarEnabled(true);
            webView.loadUrl("http://takemetomybook.atwebpages.com/main/showdashboard.php?email="+datacallclass.lemail);
        } else if (id == R.id.nav_issuebook) {
            ImageView d=(ImageView) findViewById(R.id.imageView) ;
            d.setVisibility(View.GONE);
            WebView webView = (WebView) findViewById(R.id.webviewdata);
            webView.setVisibility(View.VISIBLE);
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setVerticalScrollBarEnabled(true);
            webView.loadUrl("http://takemetomybook.atwebpages.com/main/issuedbooks.php?email="+datacallclass.lemail);

        } else if (id == R.id.nav_findbook) {
            ImageView d=(ImageView) findViewById(R.id.imageView) ;
            d.setVisibility(View.GONE);
            WebView webView = (WebView) findViewById(R.id.webviewdata);
            webView.setVisibility(View.VISIBLE);
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setVerticalScrollBarEnabled(true);
            webView.loadUrl("http://takemetomybook.atwebpages.com/main/admin/showbookpath.php");


        } else if (id == R.id.nav_profile) {
            ImageView d=(ImageView) findViewById(R.id.imageView) ;
            d.setVisibility(View.GONE);
            WebView webView = (WebView) findViewById(R.id.webviewdata);
            webView.setVisibility(View.VISIBLE);
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setVerticalScrollBarEnabled(true);
            webView.loadUrl("http://takemetomybook.atwebpages.com/main/profile.php?email="+datacallclass.lemail);

        } else if (id == R.id.changepassword) {
            ImageView d=(ImageView) findViewById(R.id.imageView) ;
            d.setVisibility(View.GONE);
            WebView webView = (WebView) findViewById(R.id.webviewdata);
            webView.setVisibility(View.VISIBLE);
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setVerticalScrollBarEnabled(true);
            webView.loadUrl("http://takemetomybook.atwebpages.com/main/changepassword.php?email="+datacallclass.lemail);

            } else if (id == R.id.changepassword) {
            ImageView d=(ImageView) findViewById(R.id.imageView) ;
            d.setVisibility(View.GONE);
            WebView webView = (WebView) findViewById(R.id.webviewdata);
            webView.setVisibility(View.VISIBLE);
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setVerticalScrollBarEnabled(true);
            webView.loadUrl("http://takemetomybook.atwebpages.com/main/changepassword.php?email="+datacallclass.lemail);

        } else if (id == R.id.nav_showbook) {
            ImageView d=(ImageView) findViewById(R.id.imageView) ;
            d.setVisibility(View.GONE);
            WebView webView = (WebView) findViewById(R.id.webviewdata);
            webView.setVisibility(View.VISIBLE);
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setVerticalScrollBarEnabled(true);
            webView.loadUrl("http://takemetomybook.atwebpages.com/main/admin/managebooks.php");

        } else if (id == R.id.nav_signout) {
            QuitApplication();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void QuitApplication(){

        int pid = android.os.Process.myPid();
        android.os.Process.killProcess(pid);
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);

    }
}
