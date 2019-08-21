#define pi pair<int,int>
#define f first
#define s second

class Solution {
public:
    
    int findMaximizedCapital(int k, int W, vector<int>& p, vector<int>& c) {
       
        int n = p.size();
        vector<pair<int,int>> projects;
        for(int i=0 ; i<n ; i++)    projects.push_back({p[i],c[i]});

        sort(projects.begin(),projects.end(),[&](pi a,pi b){ return a.s<b.s;});
        
        priority_queue<int> pq;
        
        int i=0;
        
        while(k){
            while(i<n && projects[i].s<=W)     
                pq.push(projects[i++].f);
            
            if(!pq.empty()){
                W += pq.top();
                pq.pop();
            }
            k--;
        }
        
        return W;
    }
};
