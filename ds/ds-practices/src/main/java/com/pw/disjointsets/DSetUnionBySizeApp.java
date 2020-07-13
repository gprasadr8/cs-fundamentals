package com.pw.disjointsets;

public class DSetUnionBySizeApp {

    public static void main(String[] args) {
        DSetUnionBySizeImpl unionBySize = new DSetUnionBySizeImpl(6);
        System.out.println("Initial DSet: "+unionBySize);
        unionBySize.union(1, 2);
        System.out.println("After adding relation from 1-2 \n"+unionBySize);
        unionBySize.union(3, 4);
        System.out.println("After adding relation from 3-4 \n"+unionBySize);
        unionBySize.union(3, 5);
        System.out.println("After adding relation from 3-5 \n"+unionBySize);
        System.out.println("Find(5): "+unionBySize.find(5));
        System.out.println("Find(3): "+unionBySize.find(3));
        System.out.println("Find(2): "+unionBySize.find(2));
        unionBySize.union(1, 3);
        System.out.println("After adding relation from 1-3 \n"+unionBySize);

    }
}
