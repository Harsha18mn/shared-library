def call(String username = 'null', String designation = 'null') {
	echo "This is shared library sendUser: ${username}"
	pipeline {
		environment {
			USER_NAME = "$username"
			DESG = "$designation"
		}
		agent any 
		stages {
			stage('SEND_USER') {
				steps {
					echo "Bye $USER_NAME, Nice meeting you !"
					echo "Designation: $DESG"
				}	
			}
		}
	}
}
