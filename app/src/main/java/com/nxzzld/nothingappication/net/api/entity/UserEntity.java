package com.nxzzld.nothingappication.net.api.entity;

public class UserEntity {


    private String token;
    private boolean firstLogin;
    private UserBean user;

    public boolean isFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(boolean firstLogin) {
        this.firstLogin = firstLogin;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public static class UserBean {
        /**
         * deleted : 0
         * id : 1245248658408009730
         * member : {"address":"北京西路共享家园","age":1,"birthday":"1991-11-02","city":"银川市","country":"中国","deleted":0,"email":"552400297@qq.com","emailValidationTime":null,"headImage":"https://dummyimage.com/120x200","id":"1249962557279850497","mobile":"15809688187","nickname":"HitAndRun","orgCode":null,"positionId":"0","province":"","remark":"0","sex":0,"status":0,"street":"","timeZone":"PRC","town":"","type":0,"user":null,"userId":"1245248658408009730","username":"lgyheheain1","village":"village"}
         * name : lgy
         * orgCode : null
         * status : null
         * tenementCode : 500100100100000
         * tenementId : 00000001
         * username : lgyheheain1
         */

        private int deleted;
        private String id;
        private MemberBean member;
        private String name;
        private String username;

        public int getDeleted() {
            return deleted;
        }

        public void setDeleted(int deleted) {
            this.deleted = deleted;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public MemberBean getMember() {
            return member;
        }

        public void setMember(MemberBean member) {
            this.member = member;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public static class MemberBean {
            /**
             * address : 北京西路共享家园
             * age : 1
             * birthday : 1991-11-02
             * city : 银川市
             * country : 中国
             * deleted : 0
             * email : 552400297@qq.com
             * emailValidationTime : null
             * headImage : https://dummyimage.com/120x200
             * id : 1249962557279850497
             * mobile : 15809688187
             * nickname : HitAndRun
             * orgCode : null
             * positionId : 0
             * province :宁夏
             * remark : 0
             * sex : 0
             * status : 0 //状态: 0->未完善资料, 1->已完善资料, 2-> 已认证组织待审核,3->审核通过
             * street :
             * timeZone : PRC
             * town :金凤区
             * type : 0
             * user : null
             * userId : 1245248658408009730
             * username : lgyheheain1
             * village : village
             */

            private String address;
            private int age;
            private String birthday;
            private String city;
            private String email;
            private String id;
            private String mobile;
            private String nickname;
            private int sex;// 1: 男  2 女   0：未知
            private String username;
            private String nation;//民族
            private String realName;//真实姓名
            private String idCard;//身份证
            private String outLook;//政治面貌

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getNation() {
                return nation;
            }

            public void setNation(String nation) {
                this.nation = nation;
            }

            public String getRealName() {
                return realName;
            }

            public void setRealName(String realName) {
                this.realName = realName;
            }

            public String getIdCard() {
                return idCard;
            }

            public void setIdCard(String idCard) {
                this.idCard = idCard;
            }

            public String getOutLook() {
                return outLook;
            }

            public void setOutLook(String outLook) {
                this.outLook = outLook;
            }
        }
    }
}
