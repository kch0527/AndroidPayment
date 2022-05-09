package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/*
    TextView txtContext;
    ActionMode actionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtContext = (TextView) findViewById(R.id.txtContext);
        txtContext.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                actionMode = startActionMode(actionModeCallBack);
                return true;
            }
        });
    }
    private ActionMode.Callback2 actionModeCallBack = new ActionMode.Callback2() {
        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            actionMode.setTitle("Action Menu");
            actionMode.getMenuInflater().inflate(R.menu.contextmenu, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.mnuPlus:
                    Toast.makeText(MainActivity.this,"++++++", Toast.LENGTH_SHORT).show();
                    actionMode.finish();
                    return true;
                case R.id.mnuMinus:
                    Toast.makeText(MainActivity.this,"------", Toast.LENGTH_SHORT).show();
                    actionMode.finish();
                    return true;
                default:
                return false;
            }
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {

        }
    };
*/
    public void onClick(View view) {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("결제처리");
        alertDialogBuilder.setMessage("결제하시겠습니까?");
        alertDialogBuilder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(MainActivity.this, "결제완료", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialogBuilder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(MainActivity.this, "결제실패", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

        /*
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.popup, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.mnuSearch:
                        Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT).show();
                    case R.id.mnuAdd:
                        Toast.makeText(MainActivity.this, "Add", Toast.LENGTH_SHORT).show();
                    case R.id.mnuShare:
                        Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();
                    default:
                        return true;
                }
            }
        });
        popupMenu.show();
        */
    }


/*
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("컨텍스트 메뉴");
        menu.add(0, 1, 0, "배경색 : RED");
        menu.add(0, 2, 0,"배경색 : GREEN");
        menu.add(0, 3, 0, "배경색 : BLUE");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 1:
                txtContext.setBackgroundColor(Color.RED);
                return true;
            case 2:
                txtContext.setBackgroundColor(Color.GREEN);
                return true;
            case 3:
                txtContext.setBackgroundColor(Color.BLUE);
                return true;
            default:
            return super.onContextItemSelected(item);
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.mymenu, menu);


        MenuItem item1 = menu.add(0, 1, 0, "전화기");
        item1.setIcon(R.drawable.ic_tel);
        item1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        MenuItem item2 = menu.add(0, 2, 0, "종");
        item2.setIcon(R.drawable.ic_bell);
        item2.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case 1:
                Toast.makeText(this, "TEL TEL", Toast.LENGTH_SHORT).show();
                return true;
            case 2:
                Toast.makeText(this,"BELL BELL", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onClicked(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnuPlus:
                Toast.makeText(this, "PLUS PLUS", Toast.LENGTH_SHORT).show();
            case R.id.mnuMinus:
                Toast.makeText(this,"MINUS MINUS", Toast.LENGTH_SHORT).show();
            default:
                super.onOptionsItemSelected(item);
        }
    }
 */
}