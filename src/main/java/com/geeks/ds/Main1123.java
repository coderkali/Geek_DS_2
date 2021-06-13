package com.geeks.ds;

import java.util.Scanner;

public class Main1123 {
    public static int query(int node,int s,int e, int l, int r,int[] tree)
    {
        if( l > e || r < s || s>e)
            return 0;

        if(s>=l && e<=r)
        {
            return tree[node];
        }

        int mid = (s+e)/2;
        int v1 = query(node*2,s,mid,l,r,tree);
        int v2 = query(node*2+1,mid+1,e,l,r,tree);
        return Math.max(v1,v2);
    }
    public static void update(int node, int s,int e, int idx, int val,int[] tree)
    {
        if(s==e)
        {
            tree[node] = Math.max(tree[node],val);
        }
        else
        {
            int mid = (s+e)/2;
            if(s<=idx && idx<=mid)
                update(node*2,s,mid,idx,val,tree);
            else
            {
                update(2*node+1,mid+1,e,idx,val,tree);
            }
            tree[node] = Math.max(tree[node*2],tree[node*2+1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int[] a1=new int[n];
            int[] a2=new int[n];
            int[] tree=new int[100000*5];
            a1[0]=1;
            a2[n-1]=1;
            for(int i=1;i<n;i++)
            {
                a1[i]=1;
                if(a[i]>a[i-1])
                    a1[i]+=a1[i-1];
            }
            for(int i=n-2;i>=0;i--)
            {
                a2[i]=1;
                if(a[i]<a[i+1])
                    a2[i]+=a2[i+1];
            }
            int mx=0;
            update(1, 0, 100000,a[0],a1[0],tree);
            for(int i=1;i<n;i++)
            {
                if(a[i]>1)
                {
                    mx = Math.max(mx, query(1,0,100000,1,a[i],tree) + a2[i]);
                }
                update(1,0,100000,a[i],a1[i],tree);
            }
            System.out.println(mx);
        }
    }
}