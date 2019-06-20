<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="UTF-8">
<meta http-equiv="Access-Control-Allow-Origin" content="*" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>vue首例</title>
<!-- 1.导入VUE的包 -->
<link rel="stylesheet" type="text/css"
	href="https://unpkg.com/iview/dist/styles/iview.css">
<script type="text/javascript" src="https://vuejs.org/js/vue.min.js"></script>
<script type="text/javascript"
	src="https://unpkg.com/iview/dist/iview.min.js"></script>
<script
	src="https://cdn.staticfile.org/vue-resource/1.5.1/vue-resource.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/static/css/bootstrap/bootstrap.css"
	media="all" />
</head>
<body>
	<div id="app">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3 class="panel-title">添加品牌</h3>
			</div>
			<div class="panel-body form-inline">

				<label>Name: <input type="text" v-model="billName"
					class="form-control">
				</label> <label>账单类型: <input type="text" v-model="billType"
					class="form-control">
				</label> <label>金额: <input type="text" v-model="billMoney"
					class="form-control">
				</label> <label>详情: <input type="text" v-model="billDetails"
					class="form-control">
				</label> <label>地点: <input type="text" v-model="billSite"
					class="form-control">
				</label> <input type="button" @click="add" class="btn btn-primary"
					value="添加" />
			</div>
		</div>
		<table class="table table-bordered table-hover table-striped">
			<thead>
				<tr>
					<th>账单编号</th>
					<th>账单类型</th>
					<th>金额</th>
					<th>详情</th>
					<th>时间</th>
					<th>地点</th>
					<th>消费人id</th>
					<th>家庭id</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<tr v-for="item in list" :key="item.id">
					<td>{{item.billNo}}</td>
					<td>{{item.billType}}</td>
					<td>{{item.billMoney}}</td>
					<td>{{item.billDetails}}</td>
					<td>{{item.billTime}}</td>
					<td>{{item.billSite}}</td>
					<td>{{item.billMember}}</td>
					<td>{{item.billTeam}}</td>
					<td><a href="" @click.prevent="del(item.billNo)">删除</a></td>
				</tr>
			</tbody>
		</table>
	</div>
	<script>
			Vue.http.options.toot = 'https://www.beixiaomu.com/';
			//Vue.http.options.options.emulateJSON = true;
			var vm = new Vue({
				el: "#app",
				data: {
					billNo: '',
					billName: '',
					billType: '',
					billMoney: '',
					billDetails: '',
					billSite: '',
					list: [{
							billNo: '',
							billType: '',
							billName: '',
							billMoney: '',
							billDetails: '',
							billTime: '',
							billSite: '',
							billMember: '',
							billTeam: ''
						}

					]
				},
				created() {
					//当vm实例的data和methods初始化完毕后，vm实例会自动执行created
					this.getAllList()
				},
				methods: {

					getAllList() { //获取所有的车的品牌列表
						//分析：
						//1.导入vue-resource这个包，所以，可以直接通过this.$http发起情爱去
						//2.根据接口API发起一个get请求
						//3.this.$http.get('url').then(function(result){})
						//4.当通过then指定回调函数之后，在回调函数中，可以拿到数据服务器返回的数据
						//5.先判断result.status是否等于0，如果等于0就成功了，可以把
						//result.message赋值给this.list;如果不等于0，可以弹窗提醒，获取数据失败
						this.$http.get('https://www.beixiaomu.com/family/fbill/findAll').then(result => {
							console.log(result.status)
							var status = result.status
							var result = result.body

							console.log(result)
							if(status === 200) {
								//成功了
								console.log('成功了！')
								this.list = result
							} else {
								//失败
								console.log('失败了！')
								alert('获取数据失败!');
							}
						})
					},
					add() { //添加品牌列表到后台服务器
						console.log("添加方法执行了")
						//1.this.$http.post()中有三个参数
						//2.第一个参数 ： URL地址
						//  第二个参数：提交到服务器的数据，要以对象形式
						//  第三个参数：是一个对象，要以哪种表单数据类型提交过去emulateJSON：true 以普通表单格式，将数据提交给服务器
						//3.在post方法中使用.then设置成功回调函数
						this.$http.post('https://www.beixiaomu.com/family/fbill/add', {
							billName: this.billName,
							billType: this.billType,
							billMoney: this.billMoney,
							billDetails: this.billDetails,
							billSite: this.billSite,
							billTime: new Date(),
							billMember: '1',
							billTeam: '103'
						}, {
							emulateJSON: true
						}).then(result => {
							console.log(result.status)
							var status = result.status
							var result = result.body

							console.log(result)
							if(result.msg === '1') {
								console.log('添加成功了！')
								//添加完成后只需要手动调用一下获取列表的方法
								console.log('调用getAllList()方法！')
								this.getAllList()
								console.log('getAllList()方法结束！')
							} else {
								console.log('添加失败！')
								alert('添加失败！')
							}
						})
					},
					del(billNo) { //调用删除 删除数据库里的数据
						this.$http.get('https://www.beixiaomu.com/family/fbill/delete?billNo=' + billNo).then(
							result => {
								console.log(result.status)
								var status = result.status
								var result = result.body

								console.log(result)
								if(status === 200) {
									console.log('删除成功')
									console.log('调用getAllList()方法！')
									this.getAllList()
									console.log('getAllList()方法结束！')
								} else {
									console.log('删除失败！')
									alert('删除失败！')
								}
							}
						)
					}
				},

			})
		</script>
</body>
</html>